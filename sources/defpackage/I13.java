package defpackage;

import J.N;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class I13 {
    public static ArrayList a() {
        String[][] MvmUzLgj = N.MvmUzLgj();
        ArrayList arrayList = new ArrayList(MvmUzLgj.length);
        for (String[] strArr : MvmUzLgj) {
            arrayList.add(new H13(strArr[0], strArr[1], strArr[2]));
        }
        return arrayList;
    }
}
