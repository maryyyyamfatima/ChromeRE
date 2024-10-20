package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l04, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnCancelListenerC7165l04 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Runnable a;

    public DialogInterfaceOnCancelListenerC7165l04(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.run();
    }
}
