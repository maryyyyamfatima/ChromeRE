package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class L50 implements Serializable {
    public final int a;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;
    public final boolean k;

    public L50(int i, String str, String str2, Integer num, String str3, boolean z) {
        this.a = i;
        this.g = str;
        this.h = str2;
        this.i = num;
        this.j = str3;
        this.k = z;
    }

    public L50(int i, String str, Integer num) {
        this(i, str, "*", num, "", false);
    }
}
