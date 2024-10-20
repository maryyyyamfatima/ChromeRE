package defpackage;

import android.media.MediaPlayer;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0363Cu2 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ PickerVideoPlayer a;

    public C0363Cu2(PickerVideoPlayer pickerVideoPlayer) {
        this.a = pickerVideoPlayer;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = PickerVideoPlayer.F;
        PickerVideoPlayer pickerVideoPlayer = this.a;
        ImageView imageView = pickerVideoPlayer.p;
        imageView.setImageResource(R.drawable.f50060_resource_name_obfuscated_res_0x7f090303);
        imageView.setContentDescription(pickerVideoPlayer.g.getResources().getString(R.string.f66200_resource_name_obfuscated_res_0x7f14015a));
        pickerVideoPlayer.g();
        pickerVideoPlayer.d(0, false);
    }
}
