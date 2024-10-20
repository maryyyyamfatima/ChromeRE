package defpackage;

import J.N;
import android.content.DialogInterface;
import org.chromium.content.browser.input.DateTimeChooserAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sm1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC9827sm1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C0062Am1 a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0062Am1 c0062Am1 = this.a;
        if (c0062Am1.c != dialogInterface || c0062Am1.b) {
            return;
        }
        c0062Am1.b = true;
        DateTimeChooserAndroid dateTimeChooserAndroid = c0062Am1.d.a;
        long j = dateTimeChooserAndroid.a;
        if (j == 0) {
            return;
        }
        N.MCtaZNwj(j, dateTimeChooserAndroid);
    }

    public DialogInterfaceOnDismissListenerC9827sm1(C0062Am1 c0062Am1) {
        this.a = c0062Am1;
    }
}
