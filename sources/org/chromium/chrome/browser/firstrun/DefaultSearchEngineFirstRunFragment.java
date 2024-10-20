package org.chromium.chrome.browser.firstrun;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.c;
import com.android.chrome.R;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC7296lP0;
import defpackage.FI2;
import defpackage.InterfaceC7640mP0;
import defpackage.InterfaceC8328oP0;
import defpackage.RunnableC10843vk0;
import defpackage.ViewOnClickListenerC10157tk0;
import java.util.Objects;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.components.browser_ui.widget.RadioButtonLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DefaultSearchEngineFirstRunFragment extends c implements InterfaceC7640mP0 {
    public int b0;
    public boolean c0;
    public RadioButtonLayout d0;
    public Button e0;

    @Override // defpackage.InterfaceC7640mP0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC7640mP0
    public final /* synthetic */ void reset() {
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e00bf, viewGroup, false);
        this.d0 = (RadioButtonLayout) inflate.findViewById(R.id.default_search_engine_dialog_options);
        Button button = (Button) inflate.findViewById(R.id.button_primary);
        this.e0 = button;
        button.setEnabled(false);
        int b = LocaleManager.getInstance().a.b();
        this.b0 = b;
        if (b != -1) {
            LocaleManager localeManager = LocaleManager.getInstance();
            RadioButtonLayout radioButtonLayout = this.d0;
            Button button2 = this.e0;
            final InterfaceC8328oP0 a = AbstractC7296lP0.a(this);
            Objects.requireNonNull(a);
            new ViewOnClickListenerC10157tk0(b, localeManager, radioButtonLayout, button2, new Runnable() { // from class: uk0
                @Override // java.lang.Runnable
                public final void run() {
                    ((FirstRunActivity) InterfaceC8328oP0.this).U0();
                }
            });
        }
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public final void I0(boolean z) {
        super.I0(z);
        if (z) {
            if (this.b0 == -1) {
                PostTask.c(AbstractC5103f04.a, new RunnableC10843vk0(this));
            }
            if (this.c0) {
                return;
            }
            int i = this.b0;
            if (i == 2) {
                FI2.a("SearchEnginePromo.NewDevice.Shown.FirstRun");
            } else if (i == 1) {
                FI2.a("SearchEnginePromo.ExistingDevice.Shown.FirstRun");
            }
            this.c0 = true;
        }
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void e() {
        View view = this.L;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.chooser_title).sendAccessibilityEvent(8);
    }
}
