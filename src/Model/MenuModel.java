package Model;


import Entity.EntityMenu;

import java.util.ArrayList;

public class MenuModel {
    private static ArrayList<EntityMenu> menuArrayList = new ArrayList<>();
    public static ArrayList<EntityMenu> getMenuArrayList(){
        return menuArrayList;
    }

    public static void create(EntityMenu menu){
        menuArrayList.add(menu);
    }

    public static void update(EntityMenu menu,int index){
        menuArrayList.set(index,menu);
    }

    public static void delete(int index){
        menuArrayList.remove(index);
    }

    public static void cetakMenu(){
        for (EntityMenu menu : menuArrayList){

        }
    }
}
