package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ListView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC11516xi implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewOnKeyListenerC11859yi a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi = this.a;
        viewOnKeyListenerC11859yi.l.removeOnLayoutChangeListener(this);
        viewOnKeyListenerC11859yi.getClass();
        viewOnKeyListenerC11859yi.r = new AnimatorSet();
        ListView listView = viewOnKeyListenerC11859yi.l;
        AnimatorSet.Builder builder = null;
        for (int i9 = 0; i9 < listView.getChildCount(); i9++) {
            Object tag = listView.getChildAt(i9).getTag(R.id.menu_item_enter_anim_id);
            if (tag != null) {
                if (builder == null) {
                    builder = viewOnKeyListenerC11859yi.r.play((Animator) tag);
                } else {
                    builder.with((Animator) tag);
                }
            }
        }
        viewOnKeyListenerC11859yi.r.start();
    }

    public ViewOnLayoutChangeListenerC11516xi(ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi) {
        this.a = viewOnKeyListenerC11859yi;
    }
}
