package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8847pu1 {
    public static final C8847pu1 c = new C8847pu1("COMPOSITION");
    public final List a;
    public InterfaceC9190qu1 b;

    public C8847pu1(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    public C8847pu1(C8847pu1 c8847pu1) {
        this.a = new ArrayList(c8847pu1.a);
        this.b = c8847pu1.b;
    }

    public final boolean a(int i, String str) {
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        boolean z = i == list.size() - 1;
        String str2 = (String) list.get(i);
        if (!str2.equals("**")) {
            return (z || (i == list.size() + (-2) && ((String) list.get(list.size() + (-1))).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && ((String) list.get(i + 1)).equals(str)) {
            return i == list.size() + (-2) || (i == list.size() + (-3) && ((String) list.get(list.size() + (-1))).equals("**"));
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i2)).equals(str);
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final String toString() {
        return "KeyPath{keys=" + String.valueOf(this.a) + ",resolved=" + (this.b != null) + "}";
    }
}
