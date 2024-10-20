package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ge2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803Ge2 extends AbstractC0933He2 {
    public C0803Ge2(AbstractC12077zK2 abstractC12077zK2) {
        super(abstractC12077zK2);
    }

    @Override // defpackage.AbstractC0933He2
    public final void o(int i) {
        this.a.T(i);
    }

    @Override // defpackage.AbstractC0933He2
    public final int k() {
        return this.a.I();
    }

    @Override // defpackage.AbstractC0933He2
    public final int c(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        this.a.getClass();
        return AbstractC12077zK2.A(view) + ((ViewGroup.MarginLayoutParams) ak2).topMargin + ((ViewGroup.MarginLayoutParams) ak2).bottomMargin;
    }

    @Override // defpackage.AbstractC0933He2
    public final int d(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        this.a.getClass();
        Rect rect = ((AK2) view.getLayoutParams()).g;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) ak2).leftMargin + ((ViewGroup.MarginLayoutParams) ak2).rightMargin;
    }

    @Override // defpackage.AbstractC0933He2
    public final int b(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        this.a.getClass();
        return AbstractC12077zK2.v(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ak2).bottomMargin;
    }

    @Override // defpackage.AbstractC0933He2
    public final int e(View view) {
        AK2 ak2 = (AK2) view.getLayoutParams();
        this.a.getClass();
        return (view.getTop() - AbstractC12077zK2.N(view)) - ((ViewGroup.MarginLayoutParams) ak2).topMargin;
    }

    @Override // defpackage.AbstractC0933He2
    public final int m(View view) {
        AbstractC12077zK2 abstractC12077zK2 = this.a;
        Rect rect = this.c;
        abstractC12077zK2.O(view, rect);
        return rect.bottom;
    }

    @Override // defpackage.AbstractC0933He2
    public final int n(View view) {
        AbstractC12077zK2 abstractC12077zK2 = this.a;
        Rect rect = this.c;
        abstractC12077zK2.O(view, rect);
        return rect.top;
    }

    @Override // defpackage.AbstractC0933He2
    public final int h() {
        return this.a.F();
    }

    @Override // defpackage.AbstractC0933He2
    public final int j() {
        return this.a.l;
    }

    @Override // defpackage.AbstractC0933He2
    public final int i() {
        return this.a.m;
    }

    @Override // defpackage.AbstractC0933He2
    public final int f() {
        return this.a.o;
    }

    @Override // defpackage.AbstractC0933He2
    public final int g() {
        AbstractC12077zK2 abstractC12077zK2 = this.a;
        return abstractC12077zK2.o - abstractC12077zK2.F();
    }

    @Override // defpackage.AbstractC0933He2
    public final int l() {
        AbstractC12077zK2 abstractC12077zK2 = this.a;
        return (abstractC12077zK2.o - abstractC12077zK2.I()) - abstractC12077zK2.F();
    }
}
