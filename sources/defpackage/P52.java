package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.notes.NoteCreationDialog;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.components.content_creation.notes.bridges.NoteServiceBridge;
import org.chromium.components.content_creation.notes.models.NoteTemplate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P52 implements InterfaceC7314lS3 {
    public final Activity a;
    public final WindowAndroid b;
    public final C7616mK1 c;
    public final C3419a62 d;
    public final NoteCreationDialog e;
    public final QO f;
    public final String g;
    public final String h;
    public long i;

    public P52(Activity activity, WindowAndroid windowAndroid, NoteServiceBridge noteServiceBridge, QO qo, String str, String str2, String str3) {
        this.a = activity;
        this.b = windowAndroid;
        this.f = qo;
        this.g = str;
        this.h = str3;
        String str4 = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14092c) + str3 + activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14092d);
        C7616mK1 c7616mK1 = new C7616mK1();
        this.c = c7616mK1;
        this.d = new C3419a62(c7616mK1, new S21(activity), noteServiceBridge, new C4307ci1(AbstractC0687Fh1.b(1, ProfileKey.a())));
        String MpICpYBr = N.MpICpYBr(new GURL(str));
        NoteCreationDialog noteCreationDialog = new NoteCreationDialog();
        this.e = noteCreationDialog;
        K52 k52 = new K52(this);
        long j = noteServiceBridge.a;
        boolean MzmQA0Xo = j == 0 ? false : N.MzmQA0Xo(j, noteServiceBridge);
        Runnable runnable = new Runnable() { // from class: L52
            @Override // java.lang.Runnable
            public final void run() {
                P52.this.a();
            }
        };
        noteCreationDialog.B0 = k52;
        noteCreationDialog.s0 = MpICpYBr;
        noteCreationDialog.t0 = str2;
        noteCreationDialog.u0 = str4;
        noteCreationDialog.x0 = MzmQA0Xo;
        noteCreationDialog.z0 = true;
        noteCreationDialog.A0 = runnable;
    }

    public final void a() {
        C7616mK1 c7616mK1 = this.c;
        if (c7616mK1.size() == 0) {
            return;
        }
        NoteCreationDialog noteCreationDialog = this.e;
        int i = noteCreationDialog.v0;
        long currentTimeMillis = System.currentTimeMillis() - this.i;
        int i2 = noteCreationDialog.y0;
        int i3 = ((NoteTemplate) ((C7272lK1) c7616mK1.get(i)).b.i(AbstractC3763b62.c)).a;
        EI2.k(currentTimeMillis, "NoteCreation.TimeTo.SelectTemplate");
        EI2.h(1, 3, "NoteCreation.Funnel");
        EI2.b("NoteCreation.CreationStatus", true);
        EI2.d(i2, "NoteCreation.NumberOfTemplateChanges");
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("WebNotesDynamicTemplates")) {
            if (i3 >= 11) {
                i3 = 0;
            }
            EI2.h(i3, 11, "NoteCreation.SelectedTemplate");
        } else {
            EI2.h(i3, 50, "NoteCreation.SelectedDynamicTemplateID");
        }
        if (N.M09VlOh_("WebNotesDynamicTemplates")) {
            EI2.h(i, 50, "NoteCreation.SelectedDynamicTemplateIndex");
        }
        View T0 = noteCreationDialog.T0(i);
        Bitmap createBitmap = Bitmap.createBitmap(T0.getWidth(), T0.getHeight(), Bitmap.Config.ARGB_8888);
        T0.draw(new Canvas(createBitmap));
        AbstractC5832h73.d(this.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140396), createBitmap, new Callback() { // from class: M52
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                String str;
                P52 p52 = P52.this;
                String b = p52.b();
                WindowAndroid windowAndroid = p52.b;
                ArrayList arrayList = new ArrayList(Collections.singletonList((Uri) obj));
                ArrayList arrayList2 = new ArrayList(Collections.singletonList(p52.h));
                O52 o52 = new O52(p52);
                String str2 = p52.g;
                if (TextUtils.isEmpty(str2)) {
                    str = str2;
                } else {
                    str = TextUtils.isEmpty(str2) ? str2 : ((GURL) N.M1WDPiaY(str2)).i();
                }
                C6862k73 c6862k73 = new C6862k73(windowAndroid, b, null, null, str, "image/PNG", arrayList, arrayList2, null, null, o52, null, null, null);
                long currentTimeMillis2 = System.currentTimeMillis();
                EP ep = new EP(false, false, false, null, new GURL(str2), false, false, true, null, 5);
                p52.e.L0(false, false);
                ((O73) p52.f).m(c6862k73, ep, currentTimeMillis2);
            }
        });
    }

    public final String b() {
        Locale locale;
        LocaleList locales;
        Date date = new Date(System.currentTimeMillis());
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.a;
        if (i >= 24) {
            locales = activity.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = activity.getResources().getConfiguration().locale;
        }
        return activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140399, DateFormat.getDateInstance(3, locale).format(date));
    }
}
