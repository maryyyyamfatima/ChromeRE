package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12110zR0 {
    public final List a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + ((str.hashCode() + ((0 + c) * 31)) * 31);
    }

    public C12110zR0(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
