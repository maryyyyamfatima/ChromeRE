package defpackage;

import android.content.DialogInterface;
import org.chromium.chrome.browser.image_editor.ImageEditorDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nh1 */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC8082nh1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ImageEditorDialogFragment a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.A0.cancel();
    }

    public DialogInterfaceOnClickListenerC8082nh1(ImageEditorDialogFragment imageEditorDialogFragment) {
        this.a = imageEditorDialogFragment;
    }
}
