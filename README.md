# Financial Mathematics Calculator

A comprehensive, interactive financial mathematics calculator built as a single self-contained HTML file. Covers the core topics of the theory of interest — compound interest, present value, force of interest, and annuities — with live charts, dynamic sliders, and precise number inputs.

---

## Features

### Four Calculation Modules

**Compound Interest**
- Calculates final balance, interest earned, and the Rule of 72 doubling time
- Compares compound vs. simple growth side by side on a live chart
- Supports annual, semi-annual, quarterly, monthly, and daily compounding
- Displays Effective Annual Rate (EAR) and total number of periods

**Discount Rates & Present Value**
- Computes present value from a future cash flow using a given discount rate
- Shows the discount factor v^t and the equivalent discount rate d
- Visualizes how PV decays over time relative to a fixed FV
- Reference table of v^t and d values at standard time horizons

**Force of Interest**
- Derives δ = ln(1+i) from the annual effective rate
- Compares continuous, annual, and monthly compounding growth on one chart
- Full rate equivalence table covering i, i^(2), i^(4), i^(12), δ, d, d^(2), and δ_d

**Annuities**
- Supports six annuity types:
  - Annuity-immediate (end-of-period)
  - Annuity-due (beginning-of-period)
  - Deferred annuity (m=5 deferral periods)
  - Perpetuity-immediate
  - Perpetuity-due
  - Continuous annuity (uses force of interest δ)
- Increasing and decreasing annuities with:
  - Arithmetic variation (fixed change amount Q per period)
  - Geometric variation (fixed growth rate g per period)
  - Configurable start and stop periods for the variation
- Displays PV, accumulated value (AV), and unit annuity factors a and s
- Cumulative PV and AV chart; payment-per-period bar overlay for varying annuities

---

## Interface

- **Sliders + number inputs** — every parameter has both a drag slider and a precise number field that stay in sync
- **Live metric cards** — key results update instantly at the top of each tab as you adjust parameters
- **Interactive charts** — rendered with Chart.js 4.4; tooltips, gridlines, and axis colors all theme-aware
- **Light / Dark mode** — toggle via a compact dropdown in the header; light mode is the default
  - Light: silver-white background, slate ink text
  - Dark: graphite background, cool white text, steel-blue accent
- **Responsive layout** — collapses to single-column on narrow viewports

---

## Usage

No build step, no dependencies to install. Just open the file in a browser.

```bash
# Clone or download the repo, then:
open finance-calculator.html
```

Or serve it locally:

```bash
npx serve .
# or
python -m http.server 8000
```

The only external resources loaded at runtime are:
- [DM Serif Display / DM Sans / DM Mono](https://fonts.google.com) — via Google Fonts
- [Chart.js 4.4.1](https://cdnjs.cloudflare.com/ajax/libs/Chart.js/4.4.1/chart.umd.js) — via cdnjs

Both require an internet connection. For fully offline use, download those assets and update the `<link>` and `<script>` tags to point to local copies.

---

## File Structure

```
finance-calculator.html   ← entire app: HTML + CSS + JS in one file
README.md
```

---

## Formulas Reference

| Concept | Formula |
|---|---|
| Compound interest | A = P(1 + r/n)^(nt) |
| Present value | PV = FV · (1 + i)^(−t) |
| Discount factor | v = 1/(1 + i) |
| Discount rate | d = i/(1 + i) = 1 − v |
| Force of interest | δ = ln(1 + i) |
| Continuous accumulation | A(t) = Pe^(δt) |
| Annuity-immediate PV | a_n&#124;i = (1 − v^n) / i |
| Annuity-due PV | ä_n&#124;i = (1 − v^n) / d |
| Continuous annuity PV | ā_n&#124;δ = (1 − e^(−δn)) / δ |
| Perpetuity-immediate | PV = PMT / i |
| Perpetuity-due | PV = PMT / d |

---

## Tech Stack

| Layer | Technology |
|---|---|
| Markup & layout | HTML5 / CSS3 (CSS custom properties) |
| Logic | Vanilla JavaScript (ES6+) |
| Charts | Chart.js 4.4.1 |
| Typography | DM Serif Display, DM Sans, DM Mono |

No frameworks, no bundler, no npm. One file.

---

## License

MIT — free to use, modify, and distribute.
