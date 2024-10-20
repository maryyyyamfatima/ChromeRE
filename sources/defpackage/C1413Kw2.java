package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.base.UnguessableToken;
import org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kw2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1413Kw2 {
    public final Context a;
    public PlayerCompositorDelegateImpl b;
    public C6027hi2 c;
    public C7141kw2 d;
    public final FrameLayout e;
    public final C1802Nw2 f;
    public final C11946yw2 g;
    public final boolean h;
    public final InterfaceC1283Jw2 i;
    public long j;
    public WebContentsAccessibilityImpl k;

    public final void a(C7141kw2 c7141kw2, C6027hi2 c6027hi2) {
        C6027hi2[] c6027hi2Arr = c6027hi2.d;
        if (c6027hi2Arr == null || c6027hi2Arr.length == 0) {
            return;
        }
        int i = 0;
        while (true) {
            C6027hi2[] c6027hi2Arr2 = c6027hi2.d;
            if (i >= c6027hi2Arr2.length) {
                return;
            }
            C6027hi2 c6027hi22 = c6027hi2Arr2[i];
            C7141kw2 c7141kw22 = new C7141kw2(this.a, this.b, c6027hi22.a, c6027hi22.b, c6027hi22.c, c6027hi22.f, c6027hi22.g, 0.0f, false, null, this.g, null, null, null);
            a(c7141kw22, c6027hi22);
            Rect rect = c6027hi2.e[i];
            c7141kw2.e.add(c7141kw22);
            C8173nw2 c8173nw2 = c7141kw2.a;
            ArrayList arrayList = c8173nw2.c;
            C10574uw2 c10574uw2 = c7141kw22.d;
            arrayList.add(c10574uw2);
            c8173nw2.d.add(rect);
            ArrayList arrayList2 = c8173nw2.e;
            C8173nw2 c8173nw22 = c7141kw22.a;
            arrayList2.add(c8173nw22);
            ArrayList arrayList3 = c8173nw2.f;
            arrayList3.add(new Rect());
            c8173nw22.j = true;
            c8173nw22.e(c8173nw2.l);
            PD2 pd2 = AbstractC8860pw2.e;
            PropertyModel propertyModel = c8173nw2.g;
            propertyModel.o(pd2, arrayList);
            propertyModel.o(AbstractC8860pw2.f, arrayList3);
            c10574uw2.g.e = c7141kw2.d.g;
            i++;
        }
    }

    static {
        new C1153Iw2();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Bw2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Dw2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Ew2] */
    public C1413Kw2(GURL gurl, Context context, PaintPreviewTabService paintPreviewTabService, String str, final InterfaceC1283Jw2 interfaceC1283Jw2, int i) {
        TraceEvent.b("PlayerManager", null);
        TraceEvent.j(hashCode(), "paint_preview PlayerManager init");
        this.a = context;
        this.i = interfaceC1283Jw2;
        this.h = false;
        this.b = new PlayerCompositorDelegateImpl(paintPreviewTabService, 0L, gurl, str, false, new InterfaceC3357Zv2() { // from class: zw2
            /* JADX WARN: Type inference failed for: r12v0, types: [Fw2] */
            /* JADX WARN: Type inference failed for: r13v1, types: [Hw2] */
            /* JADX WARN: Type inference failed for: r4v2, types: [Gw2] */
            @Override // defpackage.InterfaceC3357Zv2
            public final void a(UnguessableToken unguessableToken, UnguessableToken[] unguessableTokenArr, int[] iArr, int[] iArr2, int[] iArr3, UnguessableToken[] unguessableTokenArr2, int[] iArr4, float f, long j) {
                UnguessableToken[] unguessableTokenArr3 = unguessableTokenArr;
                final C1413Kw2 c1413Kw2 = C1413Kw2.this;
                c1413Kw2.getClass();
                TraceEvent.b("PlayerManager.onCompositorReady", null);
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < unguessableTokenArr3.length; i2++) {
                    boolean z = c1413Kw2.h;
                    int i3 = z ? 0 : iArr2[i2 * 2];
                    int i4 = z ? 0 : iArr2[(i2 * 2) + 1];
                    UnguessableToken unguessableToken2 = unguessableTokenArr3[i2];
                    int i5 = i2 * 2;
                    hashMap.put(unguessableToken2, new C6027hi2(unguessableToken2, iArr[i5], iArr[i5 + 1], i3, i4));
                }
                int i6 = 0;
                int i7 = 0;
                while (i6 < unguessableTokenArr3.length) {
                    C6027hi2 c6027hi2 = (C6027hi2) hashMap.get(unguessableTokenArr3[i6]);
                    int i8 = iArr3[i6];
                    C6027hi2[] c6027hi2Arr = new C6027hi2[i8];
                    Rect[] rectArr = new Rect[i8];
                    int i9 = 0;
                    while (i9 < i8) {
                        c6027hi2Arr[i9] = (C6027hi2) hashMap.get(unguessableTokenArr2[i7]);
                        int i10 = i7 * 4;
                        int i11 = iArr4[i10];
                        int i12 = iArr4[i10 + 1];
                        rectArr[i9] = new Rect(i11, i12, iArr4[i10 + 2] + i11, iArr4[i10 + 3] + i12);
                        i9++;
                        i7++;
                    }
                    c6027hi2.d = c6027hi2Arr;
                    c6027hi2.e = rectArr;
                    i6++;
                    unguessableTokenArr3 = unguessableTokenArr;
                }
                C6027hi2 c6027hi22 = (C6027hi2) hashMap.get(unguessableToken);
                c1413Kw2.c = c6027hi22;
                Context context2 = c1413Kw2.a;
                PlayerCompositorDelegateImpl playerCompositorDelegateImpl = c1413Kw2.b;
                UnguessableToken unguessableToken3 = c6027hi22.a;
                int i13 = c6027hi22.b;
                int i14 = c6027hi22.c;
                int i15 = c6027hi22.f;
                int i16 = c6027hi22.g;
                C1802Nw2 c1802Nw2 = c1413Kw2.f;
                C11946yw2 c11946yw2 = c1413Kw2.g;
                final InterfaceC1283Jw2 interfaceC1283Jw22 = c1413Kw2.i;
                Objects.requireNonNull(interfaceC1283Jw22);
                C7141kw2 c7141kw2 = new C7141kw2(context2, playerCompositorDelegateImpl, unguessableToken3, i13, i14, i15, i16, f, true, c1802Nw2, c11946yw2, new Runnable() { // from class: Fw2
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1283Jw2.this.d();
                    }
                }, new InterfaceC0079Ap3() { // from class: Gw2
                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        return Boolean.valueOf(InterfaceC1283Jw2.this.isAccessibilityEnabled());
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }
                }, new Runnable() { // from class: Hw2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1413Kw2 c1413Kw22 = C1413Kw2.this;
                        C7141kw2 c7141kw22 = c1413Kw22.d;
                        InterfaceC1283Jw2 interfaceC1283Jw23 = c1413Kw22.i;
                        if (c7141kw22 != null) {
                            C8173nw2 c8173nw2 = c7141kw22.a;
                            if ((c8173nw2 == null ? null : c8173nw2.i) != null) {
                                if (c1413Kw22.j == 0) {
                                    interfaceC1283Jw23.a();
                                    return;
                                }
                                int i17 = 0;
                                if (c1413Kw22.c.a(false)) {
                                    interfaceC1283Jw23.a();
                                    return;
                                }
                                if (!c1413Kw22.c.a(true)) {
                                    WebContentsAccessibilityImpl webContentsAccessibilityImpl = new WebContentsAccessibilityImpl(new C3227Yv2(c1413Kw22.d, c1413Kw22.j, null));
                                    c1413Kw22.k = webContentsAccessibilityImpl;
                                    c1413Kw22.d.d.m = webContentsAccessibilityImpl;
                                    return;
                                }
                                C8173nw2 c8173nw22 = c1413Kw22.d.a;
                                float b = (c8173nw22 == null ? null : c8173nw22.i).b();
                                C8173nw2 c8173nw23 = c1413Kw22.d.a;
                                float height = (c8173nw23 == null ? null : c8173nw23.i).a.getHeight();
                                if ((b * ((float) c1413Kw22.c.c)) - height > height * 0.1f) {
                                    interfaceC1283Jw23.a();
                                    return;
                                }
                                C8173nw2 c8173nw24 = c1413Kw22.d.a;
                                Rect a = (c8173nw24 == null ? null : c8173nw24.i).a();
                                boolean z2 = false;
                                int i18 = -1;
                                while (true) {
                                    C6027hi2 c6027hi23 = c1413Kw22.c;
                                    C6027hi2[] c6027hi2Arr2 = c6027hi23.d;
                                    if (i17 >= c6027hi2Arr2.length) {
                                        break;
                                    }
                                    C6027hi2 c6027hi24 = c6027hi2Arr2[i17];
                                    Rect rect = c6027hi23.e[i17];
                                    if (c6027hi24.b <= rect.width()) {
                                        if (c6027hi24.c <= rect.width()) {
                                            continue;
                                            i17++;
                                        }
                                    }
                                    if (i18 != -1) {
                                        i18 = -1;
                                        break;
                                    }
                                    if ((rect.height() * rect.width()) / (a.height() * a.width()) > 0.8f) {
                                        z2 = true;
                                    }
                                    i18 = i17;
                                    i17++;
                                }
                                if (!z2) {
                                    i18 = -1;
                                }
                                if (i18 == -1) {
                                    interfaceC1283Jw23.a();
                                    return;
                                }
                                ArrayList arrayList = c1413Kw22.d.e;
                                C7141kw2 c7141kw23 = i18 <= arrayList.size() ? (C7141kw2) arrayList.get(i18) : null;
                                if (c7141kw23 == null) {
                                    interfaceC1283Jw23.a();
                                    return;
                                }
                                Rect rect2 = c1413Kw22.c.e[i18];
                                WebContentsAccessibilityImpl webContentsAccessibilityImpl2 = new WebContentsAccessibilityImpl(new C3227Yv2(c7141kw23, c1413Kw22.j, new Size(rect2.left, rect2.top)));
                                c1413Kw22.k = webContentsAccessibilityImpl2;
                                c7141kw23.d.m = webContentsAccessibilityImpl2;
                                return;
                            }
                        }
                        interfaceC1283Jw23.a();
                    }
                });
                c1413Kw2.d = c7141kw2;
                c1413Kw2.a(c7141kw2, c1413Kw2.c);
                FrameLayout frameLayout = c1413Kw2.e;
                frameLayout.addView(c1413Kw2.d.d, new FrameLayout.LayoutParams(-1, -1));
                C1802Nw2 c1802Nw22 = c1413Kw2.f;
                if (c1802Nw22 != null) {
                    frameLayout.addView(c1802Nw22.a);
                }
                c1413Kw2.j = j;
                TraceEvent.e(c1413Kw2.hashCode(), "paint_preview PlayerManager init");
                interfaceC1283Jw22.h();
                TraceEvent.c("PlayerManager.onCompositorReady");
            }
        }, new Callback() { // from class: Aw2
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC1283Jw2.this.e(((Integer) obj).intValue());
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
        this.f = new C1802Nw2(context, new Runnable() { // from class: Bw2
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1283Jw2.this.c();
            }
        });
        this.g = new C11946yw2(new C0373Cw2(interfaceC1283Jw2), new Runnable() { // from class: Dw2
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1283Jw2.this.g();
            }
        }, new Runnable() { // from class: Ew2
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1283Jw2.this.b();
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(i);
        frameLayout.setWillNotDraw(false);
        frameLayout.postInvalidate();
        TraceEvent.c("PlayerManager");
    }
}
