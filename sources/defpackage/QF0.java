package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.h;
import com.android.chrome.R;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.password_manager.settings.ExportErrorDialogFragment;
import org.chromium.chrome.browser.password_manager.settings.ExportWarningDialogFragment;
import org.chromium.chrome.browser.password_manager.settings.ProgressBarDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QF0 {
    public int a;
    public Uri b;
    public Integer c;
    public final C8111nm0 d = new C8111nm0();
    public IF0 e;
    public ExportWarningDialogFragment f;
    public C1882Om2 g;

    /* JADX WARN: Type inference failed for: r1v2, types: [mm0] */
    public final void c() {
        if (this.a != 2) {
            return;
        }
        Integer num = this.c;
        final C8111nm0 c8111nm0 = this.d;
        if (num != null) {
            c8111nm0.d = new Runnable() { // from class: JF0
                @Override // java.lang.Runnable
                public final void run() {
                    QF0 qf0 = QF0.this;
                    qf0.a = 0;
                    if (qf0.b.equals(Uri.EMPTY)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/csv");
                    intent.putExtra("android.intent.extra.STREAM", qf0.b);
                    intent.putExtra("android.intent.extra.SUBJECT", qf0.g.a().getResources().getString(R.string.f80780_resource_name_obfuscated_res_0x7f1407da));
                    try {
                        Intent createChooser = Intent.createChooser(intent, null);
                        createChooser.addFlags(268435456);
                        V60.a.startActivity(createChooser);
                    } catch (ActivityNotFoundException unused) {
                        qf0.a(R.string.f80770_resource_name_obfuscated_res_0x7f1407d9, null, R.string.f80760_resource_name_obfuscated_res_0x7f1407d8, 3);
                    }
                    qf0.b = null;
                }
            };
            RunnableC11147wd3 runnableC11147wd3 = c8111nm0.c;
            if (runnableC11147wd3 != null) {
                runnableC11147wd3.run();
                return;
            }
            DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = c8111nm0.a;
            if (dialogInterfaceOnCancelListenerC7423lm0 != null) {
                dialogInterfaceOnCancelListenerC7423lm0.L0(false, false);
            }
            Runnable runnable = c8111nm0.d;
            if (runnable != null) {
                PostTask.c(AbstractC5103f04.a, runnable);
            }
            c8111nm0.a = null;
            c8111nm0.d = null;
            c8111nm0.c = null;
            return;
        }
        ProgressBarDialogFragment progressBarDialogFragment = new ProgressBarDialogFragment();
        progressBarDialogFragment.r0 = new OF0(this);
        h hVar = this.g.a.x;
        c8111nm0.a = progressBarDialogFragment;
        progressBarDialogFragment.Q0(hVar, null);
        RunnableC11147wd3 runnableC11147wd32 = new RunnableC11147wd3(new Runnable() { // from class: mm0
            @Override // java.lang.Runnable
            public final void run() {
                C8111nm0 c8111nm02 = C8111nm0.this;
                DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm02 = c8111nm02.a;
                if (dialogInterfaceOnCancelListenerC7423lm02 != null) {
                    dialogInterfaceOnCancelListenerC7423lm02.L0(false, false);
                }
                Runnable runnable2 = c8111nm02.d;
                if (runnable2 != null) {
                    PostTask.c(AbstractC5103f04.a, runnable2);
                }
                c8111nm02.a = null;
                c8111nm02.d = null;
                c8111nm02.c = null;
            }
        });
        c8111nm0.c = runnableC11147wd32;
        WM3 wm3 = c8111nm0.b;
        wm3.a.postDelayed(runnableC11147wd32, wm3.b);
    }

    public final void a(final int i, final String str, final int i2, final int i3) {
        Runnable runnable = new Runnable(i, str, i2, i3) { // from class: MF0
            public final /* synthetic */ int g;
            public final /* synthetic */ String h;
            public final /* synthetic */ int i;

            @Override // java.lang.Runnable
            public final void run() {
                IF0 if0 = new IF0();
                QF0 qf0 = QF0.this;
                qf0.e = if0;
                if0.a = this.i;
                if0.b = qf0.g.a().getResources().getString(this.g);
                String str2 = this.h;
                if (str2 != null) {
                    qf0.e.c = qf0.g.a().getResources().getString(R.string.f80740_resource_name_obfuscated_res_0x7f1407d6, str2);
                }
                if (qf0.f == null) {
                    qf0.b();
                }
            }
        };
        C8111nm0 c8111nm0 = this.d;
        c8111nm0.d = runnable;
        RunnableC11147wd3 runnableC11147wd3 = c8111nm0.c;
        if (runnableC11147wd3 != null) {
            runnableC11147wd3.run();
            return;
        }
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = c8111nm0.a;
        if (dialogInterfaceOnCancelListenerC7423lm0 != null) {
            dialogInterfaceOnCancelListenerC7423lm0.L0(false, false);
        }
        Runnable runnable2 = c8111nm0.d;
        if (runnable2 != null) {
            PostTask.c(AbstractC5103f04.a, runnable2);
        }
        c8111nm0.a = null;
        c8111nm0.d = null;
        c8111nm0.c = null;
    }

    public final void b() {
        ExportErrorDialogFragment exportErrorDialogFragment = new ExportErrorDialogFragment();
        IF0 if0 = this.e;
        int i = if0.a;
        exportErrorDialogFragment.s0 = if0;
        this.e = null;
        exportErrorDialogFragment.r0 = new PF0(this, i);
        exportErrorDialogFragment.Q0(this.g.a.x, null);
    }
}
