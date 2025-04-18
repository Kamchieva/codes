package Map;

import  java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashFunc {

        public static void main(String[] args) {
            Map<Person, Diamond> map = new HashMap<>();
            map.put(new Person("Jamila"), new Diamond("African Diamond"));
            System.out.println(new Person("Jamila").hashCode());
            System.out.println(new Person("Jamila").hashCode());
            System.out.println(map.get(new Person("Jamila")));

        }

        private static void maps() {
            Map<Integer, Person> map = new HashMap<>();
            map.put(1, new Person("Leyla"));
            map.put(2, new Person("Heaven"));
            map.put(3, new Person("Destiny"));
            System.out.println(map);
            System.out.println(map.size());
            System.out.println(map.get(3));
            System.out.println(map.containsKey(4));
            System.out.println(map.entrySet());
            System.out.println(map.keySet());
            map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
            map.forEach((key, person) -> {
                System.out.println(key + " - " + person);
            });
        }

            static class Person {
                String name;

                public Person(String name) {
                    this.name = name;
                }

                public String toString() {
                    return "Person{ " + "name='" + name + '\'' + '}';

                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    Person person = (Person) o;
                    return Objects.equals(name, person.name);

                }

            }


            record Diamond(String name) { }
        }

