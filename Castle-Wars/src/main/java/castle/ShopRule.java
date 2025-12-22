package castle;

import mindustry.game.*;
import static mindustry.Vars.*;
import mindustry.game.Team;
import mindustry.gen.Player;

public class ShopRule{
    public static boolean shopRuleEnabled = true;
    
    public static void Damage_Unit_Increase(PlayerData data){
        Team team = data.team().team;
        rules.teams.get(team).unitDamageMultiplier = rules.teams.get(team).unitDamageMultiplier*2f;
    };
    public static void Health_Unit_Increase(PlayerData data){
        Team team = data.team().team;
        rules.teams.get(team).unitHealthMultiplier = rules.teams.get(team).unitHealthMultiplier*2f;
    };
    public static void Damage_Block_Increase(PlayerData data){
        Team team = data.team().team;
        rules.teams.get(team).blockDamageMultiplier = rules.teams.get(team).blockDamageMultiplier*2f;
    };
     public static void Health_Block_Increase(PlayerData data){
        Team team = data.team().team;
        rules.teams.get(team).blockHealthMultiplier = rules.teams.get(team).blockHealthMultiplier*2f;
    };
}