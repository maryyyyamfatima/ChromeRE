package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lG0 */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC7251lG0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ BG0 a;
    public final /* synthetic */ Intent g;
    public final /* synthetic */ GURL h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ C12055zG0 j;

    public DialogInterfaceOnCancelListenerC7251lG0(C12055zG0 c12055zG0, BG0 bg0, Intent intent, GURL gurl, boolean z) {
        this.j = c12055zG0;
        this.a = bg0;
        this.g = intent;
        this.h = gurl;
        this.i = z;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.j.n(false, this.a, this.g, this.h, this.i);
    }
}