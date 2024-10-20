package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V21 extends AbstractBinderC1958Pb3 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ WeakReference g;
    public final /* synthetic */ W21 h;
    public final /* synthetic */ X21 i;

    public V21(Intent intent, W21 w21, X21 x21, WeakReference weakReference) {
        this.i = x21;
        this.a = intent;
        this.g = weakReference;
        this.h = w21;
    }

    @Override // defpackage.InterfaceC9767sc1
    public final void G(GoogleHelp googleHelp) {
        ViewGroup viewGroup;
        long nanoTime = System.nanoTime();
        final Intent intent = this.a;
        intent.putExtra("EXTRA_START_TICK", nanoTime);
        final Activity activity = (Activity) this.g.get();
        W21 w21 = this.h;
        if (activity == null) {
            w21.f(X21.a);
            return;
        }
        googleHelp.E = C8543p11.e;
        TogglingData togglingData = googleHelp.B;
        X21 x21 = this.i;
        if (togglingData != null) {
            x21.getClass();
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.h = charSequence;
        }
        x21.getClass();
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = InProductHelp.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            InProductHelp inProductHelp = (InProductHelp) (byteArrayExtra == null ? null : ST2.a(byteArrayExtra, creator));
            inProductHelp.a = googleHelp;
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", ST2.b(inProductHelp));
        }
        new HandlerC10413uU3(Looper.getMainLooper()).post(new Runnable() { // from class: T21
            @Override // java.lang.Runnable
            public final void run() {
                activity.startActivityForResult(intent, 123);
            }
        });
        w21.a(Status.k);
    }
}
