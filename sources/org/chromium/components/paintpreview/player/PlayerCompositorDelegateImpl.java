package org.chromium.components.paintpreview.player;

import J.N;
import android.graphics.Rect;
import defpackage.InterfaceC3357Zv2;
import defpackage.InterfaceC9229r12;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.UnguessableToken;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PlayerCompositorDelegateImpl {
    public final InterfaceC3357Zv2 a;
    public long b;
    public final ArrayList c = new ArrayList();

    public PlayerCompositorDelegateImpl(InterfaceC9229r12 interfaceC9229r12, long j, GURL gurl, String str, boolean z, InterfaceC3357Zv2 interfaceC3357Zv2, Callback callback) {
        this.a = interfaceC3357Zv2;
        if (interfaceC9229r12 == null || interfaceC9229r12.a() == 0) {
            return;
        }
        TraceEvent.b("PlayerCompositorDelegateImplJni.initialize()", null);
        this.b = N.MP_1CaX6(this, interfaceC9229r12.a(), j, gurl.i(), str, z, callback, SysUtils.amountOfPhysicalMemoryKB() < 2048);
        TraceEvent.c("PlayerCompositorDelegateImplJni.initialize()");
    }

    public void onCompositorReady(UnguessableToken unguessableToken, UnguessableToken[] unguessableTokenArr, int[] iArr, int[] iArr2, int[] iArr3, UnguessableToken[] unguessableTokenArr2, int[] iArr4, float f, long j) {
        this.a.a(unguessableToken, unguessableTokenArr, iArr, iArr2, iArr3, unguessableTokenArr2, iArr4, f, j);
    }

    public void onModerateMemoryPressure() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final int a(UnguessableToken unguessableToken, Rect rect, float f, Callback callback, Runnable runnable) {
        long j = this.b;
        if (j == 0) {
            return -1;
        }
        return N.MiIDqW7F(j, unguessableToken, callback, runnable, f, rect.left, rect.top, rect.width(), rect.height());
    }
}
