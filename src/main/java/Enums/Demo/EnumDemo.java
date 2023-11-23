package Enums.Demo;

import Enums.Demo.CowboyType;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class EnumDemo {

    public void demo() throws Exception {

        CowboyType result = isGoodBadOrUgly("good");
    }

    @Contract(pure = true)
    private CowboyType isGoodBadOrUgly(@NotNull String adjective) throws Exception {
        switch (adjective.toLowerCase()) {
            case "good", "brilliant", "awesome" -> {
                return CowboyType.GOOD;
            }
            case "bad", "pants", "rubbish" -> {
                return CowboyType.BAD;
            }
            case "ugly", "minging" -> {
                return CowboyType.UGLY;
            }
            default -> {
                throw new Exception("no");
            }
        }
    }
}