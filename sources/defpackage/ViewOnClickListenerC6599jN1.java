package defpackage;

import android.view.View;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.third_party.android.media.MediaController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jN1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6599jN1 implements View.OnClickListener {
    public final /* synthetic */ MediaController a;

    public ViewOnClickListenerC6599jN1(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaController mediaController = this.a;
        JE je = mediaController.a;
        if (je == null) {
            return;
        }
        CafExpandedControllerActivity cafExpandedControllerActivity = je.a;
        if (!cafExpandedControllerActivity.z.g() ? false : cafExpandedControllerActivity.z.a.h.l()) {
            CafExpandedControllerActivity cafExpandedControllerActivity2 = mediaController.a.a;
            if (cafExpandedControllerActivity2.z.g()) {
                cafExpandedControllerActivity2.z.a.h.m();
                EI2.h(1, 3, "Cast.Sender.Clank.FullscreenControlsAction");
            }
        } else {
            CafExpandedControllerActivity cafExpandedControllerActivity3 = mediaController.a.a;
            if (cafExpandedControllerActivity3.z.g()) {
                cafExpandedControllerActivity3.z.a.h.n();
                EI2.h(0, 3, "Cast.Sender.Clank.FullscreenControlsAction");
            }
        }
        mediaController.c();
    }
}
