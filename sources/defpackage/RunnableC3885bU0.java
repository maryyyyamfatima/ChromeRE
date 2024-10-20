package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3885bU0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ ArrayList j;

    public RunnableC3885bU0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.g = arrayList;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.a; i++) {
            View view = (View) this.g.get(i);
            String str = (String) this.h.get(i);
            WeakHashMap weakHashMap = Ec4.a;
            view.setTransitionName(str);
            ((View) this.i.get(i)).setTransitionName((String) this.j.get(i));
        }
    }
}
