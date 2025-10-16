package creational.builder.builderInformationInterface;

import creational.builder.builderWithInnerClass.Inforamtion;

public class BuilderTest {

    public static void main(String[] args) {
        System.out.println("****Builder demo with many product*******");
        InformationDirector directorFull = new InformationDirector(new FullInformationBuiledr());
        Information fullInfo = directorFull.constructFullVersion();
        System.out.println(fullInfo);
        System.out.println("*************************");
        InformationDirector directorMinimal = new InformationDirector(new MinimalInformationBuilder());
        Information minimalInfo = directorMinimal.constructMinimalVersion();
        System.out.println(minimalInfo);
    }
}
