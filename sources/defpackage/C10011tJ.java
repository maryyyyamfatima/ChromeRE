package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10011tJ implements UJ {
    public final /* synthetic */ UJ a;
    public final /* synthetic */ AbstractC11726yJ b;

    public C10011tJ(AbstractC11726yJ abstractC11726yJ, UJ uj) {
        this.b = abstractC11726yJ;
        this.a = uj;
    }

    @Override // defpackage.UJ
    public final void c() {
        if (this.a != null) {
            this.b.c.post(new RunnableC8640pJ(this));
        }
    }

    @Override // defpackage.UJ
    public final void b(VJ vj) {
        UJ uj = this.a;
        AbstractC11726yJ abstractC11726yJ = this.b;
        if (uj != null) {
            abstractC11726yJ.c.post(new RunnableC8983qJ(this, vj));
        }
        abstractC11726yJ.c.postDelayed(new RunnableC9668sJ(this, vj), 1L);
    }

    @Override // defpackage.UJ
    public final void a(VJ vj) {
        UJ uj = this.a;
        AbstractC11726yJ abstractC11726yJ = this.b;
        if (uj != null) {
            abstractC11726yJ.c.post(new RunnableC9325rJ(this, vj));
        }
        abstractC11726yJ.c.postDelayed(new RunnableC9668sJ(this, vj), 1L);
    }
}
