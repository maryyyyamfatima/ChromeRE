package defpackage;

import androidx.fragment.app.c;
import androidx.fragment.app.h;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vT0 */
/* loaded from: classes.dex */
public final class C10748vT0 implements InterfaceC10405uT0 {
    public final int a;
    public final int b;
    public final /* synthetic */ h c;

    public C10748vT0(h hVar, int i, int i2) {
        this.c = hVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.InterfaceC10405uT0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        h hVar = this.c;
        c cVar = hVar.x;
        int i = this.a;
        if (cVar == null || i >= 0 || !cVar.J().O()) {
            return hVar.P(arrayList, arrayList2, i, this.b);
        }
        return false;
    }
}
