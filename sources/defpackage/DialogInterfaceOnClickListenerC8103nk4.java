package defpackage;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nk4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC8103nk4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity a;

    public DialogInterfaceOnClickListenerC8103nk4(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finishAndRemoveTask();
    }
}
