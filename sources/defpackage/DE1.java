package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DE1 {
    public final InterfaceC9208qx2 a;
    public final List b;
    public final String c;

    public DE1(Class cls, Class cls2, Class cls3, List list, C8974qH0 c8974qH0) {
        this.a = c8974qH0;
        if (!list.isEmpty()) {
            this.b = list;
            String simpleName = cls.getSimpleName();
            String simpleName2 = cls2.getSimpleName();
            this.c = Y5.a(AbstractC10975w63.a("Failed LoadPath{", simpleName, "->", simpleName2, "->"), cls3.getSimpleName(), "}");
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final JO2 a(int i, int i2, C0543Ee2 c0543Ee2, InterfaceC8075ng0 interfaceC8075ng0, C0431Di0 c0431Di0) {
        InterfaceC9208qx2 interfaceC9208qx2 = this.a;
        List list = (List) interfaceC9208qx2.b();
        AbstractC6464iy2.b(list);
        try {
            List list2 = this.b;
            int size = list2.size();
            JO2 jo2 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    jo2 = ((C1211Ji0) list2.get(i3)).a(i, i2, c0543Ee2, interfaceC8075ng0, c0431Di0);
                } catch (EZ0 e) {
                    list.add(e);
                }
                if (jo2 != null) {
                    break;
                }
            }
            if (jo2 != null) {
                return jo2;
            }
            throw new EZ0(this.c, new ArrayList(list));
        } finally {
            interfaceC9208qx2.a(list);
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("LoadPath{decodePaths=", Arrays.toString(this.b.toArray()), "}");
    }
}
