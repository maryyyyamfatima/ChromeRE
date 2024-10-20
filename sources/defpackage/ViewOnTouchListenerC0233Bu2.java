package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.chromium.components.browser_ui.photo_picker.PickerVideoPlayer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC0233Bu2 implements View.OnTouchListener {
    public final /* synthetic */ PickerVideoPlayer a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.E.a.a.onTouchEvent(motionEvent);
        return false;
    }

    public ViewOnTouchListenerC0233Bu2(PickerVideoPlayer pickerVideoPlayer) {
        this.a = pickerVideoPlayer;
    }
}
