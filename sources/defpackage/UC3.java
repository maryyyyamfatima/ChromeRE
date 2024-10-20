package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class UC3 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int g;

    public /* synthetic */ UC3(int i, long j) {
        this.a = j;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StringBuilder sb = new StringBuilder("Startup.Android.TimeToGTSFirstMeaningfulPaint");
        sb.append(AbstractC5241fQ2.b ^ true ? ".Cold" : ".Warm");
        int i = this.g;
        sb.append(AbstractC5241fQ2.f(i));
        sb.append(": ");
        sb.append(i);
        sb.append(" thumbnails ");
        long j = this.a;
        sb.append(j);
        sb.append("ms");
        AbstractC4851eH1.d("TabSwitcherOnReturn", sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder("Startup.Android.TimeToGTSFirstMeaningfulPaint");
        sb2.append(AbstractC5241fQ2.b ^ true ? ".Cold" : ".Warm");
        sb2.append(AbstractC5241fQ2.f(i));
        EI2.n(j, sb2.toString());
        EI2.n(j, "Startup.Android.TimeToGTSFirstMeaningfulPaint".concat(AbstractC5241fQ2.b ^ true ? ".Cold" : ".Warm"));
        EI2.n(j, "Startup.Android.TimeToGTSFirstMeaningfulPaint");
        EI2.d(i, "Startup.Android.ThumbnailFetchedForGTSFirstMeaningfulPaint");
        AbstractC5241fQ2.b = true;
    }
}
