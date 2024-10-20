package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11051wL0 {
    public Bitmap a;
    public String b;
    public final Bundle c;
    public String d;
    public String e;
    public final ArrayList f;
    public boolean g;
    public final String h;

    public C11051wL0(Context context) {
        String b;
        AbstractC9252r51.c = context.getContentResolver();
        this.c = new Bundle();
        this.f = new ArrayList();
        new ApplicationErrorReport();
        try {
            if (((Boolean) AbstractC6301iW0.a.a()).booleanValue()) {
                b = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                b = BL0.b();
            }
            this.h = b;
        } catch (SecurityException unused) {
            this.h = BL0.b();
        }
    }

    public C11051wL0() {
        this.c = new Bundle();
        this.f = new ArrayList();
        new ApplicationErrorReport();
        this.h = BL0.b();
    }

    public final void b() {
        if (((this.c.isEmpty() && this.f.isEmpty()) ? false : true) && this.g) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.g = false;
    }

    public final FeedbackOptions a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.r = this.a;
        feedbackOptions.k = null;
        feedbackOptions.a = this.b;
        feedbackOptions.h = this.d;
        feedbackOptions.g = this.c;
        feedbackOptions.j = this.e;
        feedbackOptions.m = this.f;
        feedbackOptions.n = false;
        feedbackOptions.o = null;
        feedbackOptions.p = null;
        feedbackOptions.q = this.g;
        feedbackOptions.s = this.h;
        feedbackOptions.t = false;
        feedbackOptions.u = 0L;
        feedbackOptions.v = false;
        return feedbackOptions;
    }
}
