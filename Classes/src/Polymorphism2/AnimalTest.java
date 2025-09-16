package Polymorphism2;

class Human extends Animal{

    @Override
    public void move(){
        System.out.println("이족 보행");
    }

    public void talk(){
        System.out.println("喋っています。");
    }
}

class Horse extends Animal{
    
    @Override
    public void move(){
        System.out.println("4족 보행");
    }

    public void run(){
        System.out.println("早く走る");
    }
}

class Eagle extends Animal{

    @Override
    public void move(){
        System.out.println("飛ぶ");
    }

    public void fly(){
        System.out.println("空を飛んでいます");
    }
}


public class AnimalTest {
    public static void main(String[] args) {

        //1. 다형성 - 자동 형변환(업캐스팅)
        Animal animal = new Human();
        animal.move();

        System.out.println("------------");

        //2. 다형성 - 강제 형변환(다운캐스팅) => instanceof 사용
        if(animal instanceof Human){
            Human human = (Human)animal; // Human은 Animal의 상속, (Human)으로 강제 다운
            human.talk();
        }

        // 배열
        Animal[] animals = new Animal[3];

        animals[0] = new Human();
        animals[1] = new Horse();
        animals[2] = new Eagle();

        //다운캐스팅
        for(int i = 0; i < animals.length; i++){
            Animal animal1 = animals[i];
            if(animal1 instanceof Human){
                Human human = (Human)animal1;
                human.talk();
                System.out.println("------------");
            }else if(animal1 instanceof Horse){
                Horse horse = (Horse)animal1;
                horse.run();
                System.out.println("------------");
            }else if(animal1 instanceof Eagle){
                Eagle eagle = (Eagle)animal1;
                eagle.fly();
                System.out.println("------------");
            }else{
                System.out.println("미지원");
            }
        }

    }
}
