package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6059hn4 {
    public final String a;
    public final String b;
    public final C3997bn4 c;
    public final boolean d;

    public C6059hn4(String str, String str2, C3997bn4 c3997bn4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = c3997bn4;
        this.d = z;
    }

    public static Parcelable[] a(List list) {
        Parcelable[] parcelableArr = new Parcelable[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C6059hn4 c6059hn4 = (C6059hn4) it.next();
            c6059hn4.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("id", c6059hn4.a);
            bundle.putString("label", c6059hn4.b);
            C3997bn4 c3997bn4 = c6059hn4.c;
            c3997bn4.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("currency", c3997bn4.a);
            bundle2.putString("value", c3997bn4.b);
            bundle.putBundle("amount", bundle2);
            bundle.putBoolean("selected", c6059hn4.d);
            parcelableArr[i] = bundle;
            i++;
        }
        return parcelableArr;
    }
}
