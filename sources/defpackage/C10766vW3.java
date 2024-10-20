package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vW3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10766vW3 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public C10766vW3(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10766vW3)) {
            return false;
        }
        C10766vW3 c10766vW3 = (C10766vW3) obj;
        return this.b == c10766vW3.b && this.a.equals(c10766vW3.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = M41.a("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        a.append(this.b);
        a.append("\n");
        String a2 = AbstractC7848n0.a(a.toString(), "    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            a2 = a2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return a2;
    }
}
