package defpackage;

import android.content.DialogInterface;
import org.chromium.chrome.browser.image_editor.ImageEditorDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mh1 */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC7738mh1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ImageEditorDialogFragment a;

    public DialogInterfaceOnClickListenerC7738mh1(ImageEditorDialogFragment imageEditorDialogFragment) {
        this.a = imageEditorDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.m0.dismiss();
    }
}
