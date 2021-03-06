package students.polina_ivashkevich.lesson_14.level_1.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

class Apple {

        private String color;
        private int weight;

        public Apple(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Apple apple = (Apple) o;
            return weight == apple.weight &&
                    Objects.equals(color, apple.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, weight);
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> getAllColoredApples(List<Apple> apples, String color) {
        return apples.stream()
                .filter(a -> a.getColor().equals(color))
                .collect(toList());
    }

    public List<Apple> getApplesWithWeight(List<Apple> apples, int weight) {
        return apples.stream()
                .filter(a -> a.getWeight() > weight)
                .collect(toList());
    }

    public List<Apple> getSpecificApples(List<Apple> apples, Predicate<Apple> applePredicate) {
        return apples.stream()
                .filter(applePredicate)
                .collect(toList());
    }

    public List<Apple> getSpecificApples_1(List<Apple> apples, ApplePredicate applePredicate) {
        return apples.stream()
                .filter(applePredicate::test)
                .collect(toList());
    }
}



