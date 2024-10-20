package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ty1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2591Ty1 implements InterfaceC7960nK1 {
    public final int a;
    public LayoutInflater b;

    public C2591Ty1(int i) {
        this.a = i;
    }

    @Override // defpackage.InterfaceC7960nK1
    public final View a(ViewGroup viewGroup) {
        if (this.b == null) {
            this.b = LayoutInflater.from(viewGroup.getContext());
        }
        return this.b.inflate(this.a, viewGroup, false);
    }
}
