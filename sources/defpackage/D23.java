package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.d;
import org.chromium.chrome.browser.language.settings.SelectLanguageFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D23 extends AbstractC0892Gw1 {
    public final /* synthetic */ SelectLanguageFragment r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D23(SelectLanguageFragment selectLanguageFragment, Activity activity) {
        super(activity);
        this.r = selectLanguageFragment;
    }

    @Override // defpackage.AbstractC0892Gw1, defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        super.C(dVar, i);
        final C10230tw1 c10230tw1 = (C10230tw1) N(i);
        final A23 a23 = this.r.g0;
        ((C0762Fw1) dVar).a.setOnClickListener(new View.OnClickListener() { // from class: Ew1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                A23 a232 = a23;
                a232.getClass();
                int i2 = SelectLanguageFragment.h0;
                Intent intent = new Intent();
                intent.putExtra("SelectLanguageFragment.SelectedLanguage", c10230tw1.a);
                Activity activity = a232.a;
                activity.setResult(-1, intent);
                activity.finish();
            }
        });
    }
}
