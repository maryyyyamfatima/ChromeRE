package org.chromium.chrome.browser.keyboard_accessory.bar_component;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC2181Qu1;
import defpackage.DK2;
import defpackage.KU3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class g extends DK2 {
    public final /* synthetic */ KeyboardAccessoryModernView a;

    public g(KeyboardAccessoryModernView keyboardAccessoryModernView) {
        this.a = keyboardAccessoryModernView;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        if (i != 0) {
            KeyboardAccessoryModernView keyboardAccessoryModernView = this.a;
            keyboardAccessoryModernView.a.h0(keyboardAccessoryModernView.o);
            KU3 b = AbstractC2181Qu1.b();
            if (b != null) {
                b.notifyEvent("keyboard_accessory_bar_swiped");
            }
        }
    }
}
