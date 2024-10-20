package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4915eU0 implements KV3 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList g;

    @Override // defpackage.KV3
    public final void b() {
    }

    @Override // defpackage.KV3
    public final void d() {
    }

    @Override // defpackage.KV3
    public final void e() {
    }

    public C4915eU0(View view, ArrayList arrayList) {
        this.a = view;
        this.g = arrayList;
    }

    @Override // defpackage.KV3
    public final void a(QV3 qv3) {
        qv3.w(this);
        qv3.a(this);
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        qv3.w(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }
}
