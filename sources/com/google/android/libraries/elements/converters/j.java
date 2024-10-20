package com.google.android.libraries.elements.converters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC6726jk3;
import defpackage.C10200tr1;
import defpackage.C11949yx0;
import defpackage.C7849n00;
import defpackage.C8029nY0;
import defpackage.EnumC11068wO2;
import defpackage.GestureDetectorOnDoubleTapListenerC12292zx0;
import defpackage.GestureDetectorOnGestureListenerC0116Ax0;
import defpackage.InterfaceC6894kD2;
import defpackage.SY;
import defpackage.WZ;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class j extends WZ {
    public static final /* synthetic */ int T = 0;

    @SY(type = 10)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    WZ D;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List E;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List F;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List G;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List H;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List I;

    /* renamed from: J */
    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean f11500J;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean K;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean L;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List M;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List N;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List O;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List P;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List Q;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List R;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List S;

    @Override // defpackage.AbstractC10593v00
    public final boolean o() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    public j() {
        super("ElementEventWithGesture");
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new i();
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        j jVar = (j) super.k0();
        WZ wz = jVar.D;
        jVar.D = wz != null ? wz.k0() : null;
        jVar.z = new i();
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bb  */
    @Override // defpackage.AbstractC10593v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.WZ z(defpackage.C7849n00 r18) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.j.z(n00):WZ");
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C11949yx0 c11949yx0 = new C11949yx0();
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        AbstractC6726jk3 abstractC6726jk3 = this.z;
        ((i) abstractC6726jk3).b = atomicBoolean;
        ((i) abstractC6726jk3).c = atomicReference;
        ((i) abstractC6726jk3).a = c11949yx0;
        ((i) abstractC6726jk3).d = atomicReference2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x02f2, code lost:            if (r6.a() != false) goto L604;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:            if (r5 != 6) goto L573;     */
    @Override // defpackage.AbstractC10593v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.C6206iD0 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.j.i(iD0, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        i iVar = (i) abstractC6726jk3;
        i iVar2 = (i) abstractC6726jk32;
        iVar2.a = iVar.a;
        iVar2.b = iVar.b;
        iVar2.c = iVar.c;
        iVar2.d = iVar.d;
    }

    @Override // defpackage.AbstractC10593v00
    public final void D() {
        C11949yx0 c11949yx0 = ((i) this.z).a;
        List list = this.E;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C10200tr1) it.next()).c();
            }
        }
        c11949yx0.b = null;
        c11949yx0.c = null;
        c11949yx0.d = null;
        c11949yx0.e = null;
        c11949yx0.f = null;
        c11949yx0.g = null;
        c11949yx0.h = null;
        c11949yx0.a = new WeakReference(null);
    }

    @Override // defpackage.AbstractC10593v00
    public final void w(C7849n00 c7849n00) {
        i iVar = (i) this.z;
        C11949yx0 c11949yx0 = iVar.a;
        AtomicReference atomicReference = iVar.c;
        Context context = c7849n00.a;
        C8029nY0 c8029nY0 = (C8029nY0) atomicReference.get();
        if (c8029nY0 == null) {
            c8029nY0 = new C8029nY0(context, new GestureDetectorOnGestureListenerC0116Ax0(c11949yx0), new Handler(Looper.getMainLooper()));
            atomicReference.set(c8029nY0);
        }
        c8029nY0.a.a.setOnDoubleTapListener(c11949yx0.f != null ? new GestureDetectorOnDoubleTapListenerC12292zx0(c11949yx0) : null);
    }
}
