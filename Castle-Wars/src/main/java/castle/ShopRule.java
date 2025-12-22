package castle;

import mindustry.game.*;
import static mindustry.Vars.*;
import mindustry.game.Team;
import mindustry.gen.Player;

public class ShopRule{
    public static boolean shopRuleEnabled = true;
    
    public static void Damage_Unit_Increase(Rules rules, PlayerData data){
        Team team = data.team().team;
        rules.teams.get(team).unitDamageMultiplier = rules.teams.get(team).unitDamageMultiplier*2f;
    };
}