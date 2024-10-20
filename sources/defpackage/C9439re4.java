package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: re4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9439re4 implements Callback {
    public final /* synthetic */ ViewOnLayoutChangeListenerC10125te4 a;

    public /* synthetic */ C9439re4(ViewOnLayoutChangeListenerC10125te4 viewOnLayoutChangeListenerC10125te4) {
        this.a = viewOnLayoutChangeListenerC10125te4;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ViewOnLayoutChangeListenerC10125te4 viewOnLayoutChangeListenerC10125te4 = this.a;
        viewOnLayoutChangeListenerC10125te4.i.getClass();
        viewOnLayoutChangeListenerC10125te4.l.onResult(new C9880sv0(bitmap, viewOnLayoutChangeListenerC10125te4.j.a(), viewOnLayoutChangeListenerC10125te4.h, viewOnLayoutChangeListenerC10125te4.e()));
    }
}
