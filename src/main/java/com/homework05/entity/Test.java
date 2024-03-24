package com.homework05.entity;

public class Test {
    public static void main(String[] args) {
        Role role1 = createUser("1","普通用户");
        Role role2 = createUser("2","VIP");
        Game game1 = createUser("1","魂斗罗","null");
        Game game2 = createUser("2","超级马里奥","null");
        Game[] games = {game1, game2};
        User user = createUser("1","Mike",games,role2);
        listGames(user);



    }
    //创建角色对象
    public static Role createUser(String id, String name){
        Role role;
        role = new Role(id,name);

        return role;
    }
    //创建游戏对象
    public static Game createUser(String id,String name,String introduction){
        Game game ;
        game = new Game(id,name,introduction);
        return game;
    }
    //创建用户对象
    public static User createUser(String id,String name,Game[] games,Role role){
        User user;
        user = new User(id,name,games,role);
        return user;

    }
    //创建listGames方法并返回用户中的全部个游戏名称
    public static void listGames(User user){
        Game[] games = new Game[user.getGames().length];
        games = user.getGames();
        for(int i = 0; i < user.getGames().length; i++){
            System.out.println(games[i].getName());
        }
    }

}
