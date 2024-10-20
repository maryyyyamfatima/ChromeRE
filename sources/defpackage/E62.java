package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E62 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public final boolean d;
    public final Bundle e;
    public ArrayList f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public E62(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    public E62(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.d = true;
        this.h = true;
        this.a = iconCompat;
        this.b = K62.c(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
        this.i = false;
        this.j = false;
    }

    public final F62 a() {
        Set set;
        if (this.i && this.c == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C7283lM2 c7283lM2 = (C7283lM2) it.next();
                if ((c7283lM2.c || (set = c7283lM2.e) == null || set.isEmpty()) ? false : true) {
                    arrayList.add(c7283lM2);
                } else {
                    arrayList2.add(c7283lM2);
                }
            }
        }
        return new F62(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (C7283lM2[]) arrayList2.toArray(new C7283lM2[arrayList2.size()]), arrayList.isEmpty() ? null : (C7283lM2[]) arrayList.toArray(new C7283lM2[arrayList.size()]), this.d, this.g, this.h, this.i, this.j);
    }
}
