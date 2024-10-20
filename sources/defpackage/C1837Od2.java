package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Od2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1837Od2 {
    public final InterfaceC0090As a;
    public final List b;
    public final List c;
    public final Uri d;

    public C1837Od2(C1707Nd2 c1707Nd2) {
        this.a = c1707Nd2.a;
        this.b = c1707Nd2.b;
        this.c = c1707Nd2.c;
        this.d = c1707Nd2.d;
    }

    public final ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        List list = this.c;
        if (!list.isEmpty()) {
            int i = LY1.g;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            LY1 ly1 = !arrayList2.isEmpty() ? new LY1(outputStream, arrayList2) : null;
            if (ly1 != null) {
                arrayList.add(ly1);
            }
        }
        Iterator it2 = this.b.iterator();
        if (it2.hasNext()) {
            X5.a(it2.next());
            throw null;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
