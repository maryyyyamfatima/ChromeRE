package com.google.android.libraries.elements.converters.intersectionobserver;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.AbstractC9053qX;
import defpackage.C1629Mo;
import defpackage.C2794Vn;
import defpackage.C2924Wn;
import defpackage.C3998bo;
import defpackage.InterfaceC8177nx0;
import defpackage.U80;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class IntersectionObserver extends com.google.android.libraries.elements.interfaces.IntersectionObserver {
    final AbstractC9053qX commandEventData;
    private final AtomicReference viewRef = new AtomicReference(null);

    public IntersectionObserver(AbstractC9053qX abstractC9053qX) {
        if (abstractC9053qX == null) {
            C2794Vn a = AbstractC9053qX.a();
            a.b(U80.a);
            abstractC9053qX = a.a();
        }
        this.commandEventData = abstractC9053qX;
    }

    public AbstractC9053qX commandEventDataWithView() {
        View view = (View) this.viewRef.get();
        if (view != null) {
            C2924Wn c2924Wn = (C2924Wn) this.commandEventData;
            c2924Wn.getClass();
            View view2 = c2924Wn.b;
            C1629Mo c1629Mo = c2924Wn.c;
            Object obj = c2924Wn.d;
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = c2924Wn.e;
            InterfaceC8177nx0 interfaceC8177nx0 = c2924Wn.f;
            String str = c2924Wn.g;
            C3998bo c3998bo = c2924Wn.h;
            U80 u80 = c2924Wn.i;
            if (u80 == null) {
                throw new IllegalStateException("Missing required properties: conversionContext");
            }
            return new C2924Wn(view, view2, c1629Mo, obj, senderStateOuterClass$SenderState, interfaceC8177nx0, str, c3998bo, u80);
        }
        return this.commandEventData;
    }

    public U80 conversionContext() {
        return ((C2924Wn) this.commandEventData).i;
    }

    public void onViewDiscovered(View view) {
        this.viewRef.set(view);
    }

    public void onViewInvalidated() {
        this.viewRef.set(null);
    }
}
