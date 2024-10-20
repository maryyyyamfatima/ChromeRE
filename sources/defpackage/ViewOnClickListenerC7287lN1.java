package defpackage;

import android.view.View;
import org.chromium.third_party.android.media.MediaController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lN1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC7287lN1 implements View.OnClickListener {
    public final /* synthetic */ MediaController a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaController mediaController = this.a;
        JE je = mediaController.a;
        if (je == null) {
            return;
        }
        mediaController.a.b(je.a() - 5000);
        mediaController.d();
    }

    public ViewOnClickListenerC7287lN1(MediaController mediaController) {
        this.a = mediaController;
    }
}
