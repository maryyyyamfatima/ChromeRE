package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3755b50 {
    public final long a;
    public final Rect b;
    public ArrayList c;

    public abstract String a();

    public AbstractC3755b50(long j, Rect rect) {
        this.a = j;
        this.b = rect;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" id:");
        sb.append(this.a);
        sb.append(" bounds:");
        sb.append(this.b);
        ArrayList arrayList = this.c;
        if ((arrayList == null || arrayList.isEmpty()) ? false : true) {
            sb.append(" children:");
            sb.append(this.c.size());
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                sb.append(((AbstractC3755b50) it.next()).toString());
            }
        }
        return sb.toString();
    }
}
