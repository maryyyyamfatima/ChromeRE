package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ae0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021Ae0 {
    public final C5802h23 a;
    public TextView b;
    public TextView c;
    public boolean d;

    public C0021Ae0(ImageButton imageButton, View view) {
        view.setTranslationX(-imageButton.getResources().getDimensionPixelSize(R.dimen.f34870_resource_name_obfuscated_res_0x7f0803bf));
        this.a = new C5802h23(imageButton, view);
    }

    public final void a(int i) {
        C5802h23 c5802h23 = this.a;
        AnimatorSet animatorSet = c5802h23.c;
        AnimatorSet animatorSet2 = c5802h23.d;
        ImageButton imageButton = c5802h23.a;
        if (i == 0) {
            imageButton.setImageDrawable(null);
            if (animatorSet.isStarted()) {
                animatorSet.cancel();
            }
            if (animatorSet2.isStarted() || c5802h23.b.getTranslationX() == (-c5802h23.e)) {
                return;
            }
            animatorSet2.start();
            return;
        }
        imageButton.setImageResource(i);
        if (animatorSet2.isStarted()) {
            animatorSet2.cancel();
        }
        if (animatorSet.isStarted() || imageButton.getVisibility() == 0) {
            return;
        }
        animatorSet.start();
    }
}
