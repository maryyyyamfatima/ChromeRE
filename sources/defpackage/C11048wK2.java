package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wK2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11048wK2 implements InterfaceC4961ec4 {
    public final /* synthetic */ AbstractC12077zK2 a;

    public C11048wK2(AbstractC12077zK2 abstractC12077zK2) {
        this.a = abstractC12077zK2;
    }

    @Override // defpackage.InterfaceC4961ec4
    public final View a(int i) {
        return this.a.w(i);
    }

    @Override // defpackage.InterfaceC4961ec4
    public final int c() {
        return this.a.G();
    }

    @Override // defpackage.InterfaceC4961ec4
    public final int b(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        this.a.getClass();
        return (view.getLeft() - AbstractC12077zK2.E(view)) - ((ViewGroup.MarginLayoutParams) ak2).leftMargin;
    }

    @Override // defpackage.InterfaceC4961ec4
    public final int e(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        this.a.getClass();
        return AbstractC12077zK2.L(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ak2).rightMargin;
    }

    @Override // defpackage.InterfaceC4961ec4
    public final int d() {
        AbstractC12077zK2 abstractC12077zK2 = this.a;
        return abstractC12077zK2.n - abstractC12077zK2.H();
    }
}
