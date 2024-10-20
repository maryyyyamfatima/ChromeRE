package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5066eu1 {
    public static final Class a(InterfaceC5410fu1 interfaceC5410fu1) {
        AbstractC0087Ar1.e(interfaceC5410fu1, "<this>");
        Class a = ((JS) interfaceC5410fu1).a();
        if (!a.isPrimitive()) {
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a : Double.class;
            case 104431:
                return !name.equals("int") ? a : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a : Byte.class;
            case 3052374:
                return !name.equals("char") ? a : Character.class;
            case 3327612:
                return !name.equals("long") ? a : Long.class;
            case 3625364:
                return !name.equals("void") ? a : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a : Float.class;
            case 109413500:
                return !name.equals("short") ? a : Short.class;
            default:
                return a;
        }
    }
}
