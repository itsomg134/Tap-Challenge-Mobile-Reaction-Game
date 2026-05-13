# Tap Challenge - Mobile Reaction Game

A fast-paced, addictive tapping game where your reflexes determine your score! Tap as many times as you can within 10 seconds. Built with pure HTML/CSS/JavaScript - no dependencies required.

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Platform](https://img.shields.io/badge/platform-Web%20%7C%20Mobile-brightgreen)
![License](https://img.shields.io/badge/license-MIT-green)

<img width="482" height="740" alt="Screenshot_13-5-2026_23130_127 0 0 1" src="https://github.com/user-attachments/assets/52d5a507-8985-472a-9b62-ad8c128b0a4d" />


##  Game Features

- **10-Second Timer** - Race against the clock
- **Real-time Score Tracking** - Watch your score grow with every tap
- **Visual Feedback** - Satisfying tap animations and color changes
- **Responsive Design** - Works perfectly on all screen sizes
- **Touch Optimized** - Built for mobile with touch event support
- **Instant Restart** - One-tap to play again
- **Zero Dependencies** - Pure vanilla JavaScript

## How to Play

1. Tap the colored area to start the game
2. Tap as fast as you can within 10 seconds
3. Each tap = 1 point
4. Try to beat your high score!

## 📱 Play Now

Or run locally:
```bash
git clone https://github.com/your-username/tap-challenge.git
cd tap-challenge
open index.html
```

##  Quick Start

### Option 1: VS Code with Live Server (Recommended)

```bash
# Clone the repository
git clone https://github.com/your-username/tap-challenge.git

# Open in VS Code
code tap-challenge

# Right-click index.html -> Open with Live Server
```

### Option 2: Local Web Server

```bash
# Using Python 3
python -m http.server 8000

# Using Node.js
npx serve .

# Then visit http://localhost:8000
```

### Option 3: Direct Browser

Simply double-click `index.html` to open in your default browser.

## Tech Stack

- **HTML5** - Structure and semantic markup
- **CSS3** - Animations, gradients, and responsive design
- **Vanilla JavaScript** - Game logic and event handling
- **No Frameworks** - Pure, lightweight code (~5KB total)

## Project Structure

```
tap-challenge/
│
├── index.html          # Main game file (HTML, CSS & JS included)
├── README.md           # Project documentation
└── LICENSE             # MIT License
```

## Customization

### Modify Game Duration
```javascript
// Find this line in index.html
let timeLeft = 10;  // Change to desired seconds
```

### Change Colors
```css
/* Modify gradients in the CSS */
background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
```

### Adjust Difficulty
```javascript
// Add scoring multipliers or combo systems
if (score > 50) {
    // Add bonus points or effects
}
```

## Mobile Compatibility

| Browser | Version | Status |
|---------|---------|--------|
| Chrome | 90+ |  Perfect |
| Safari | 14+ |  Perfect |
| Firefox | 88+|  Perfect |
| Edge | 90+   |  Perfect |
| Samsung Internet | 13+ |  Perfect |

## Performance Optimizations

- Touch event handling with `preventDefault()` for smooth scrolling
- CSS `transform` animations for 60fps performance  
- Hardware-accelerated animations
- No memory leaks with proper interval cleanup
- Optimized for low-end devices

## Future Enhancements

- [ ] High score tracking with localStorage
- [ ] Progressive difficulty levels
- [ ] Combo multiplier system
- [ ] Sound effects
- [ ] Haptic feedback on mobile
- [ ] Leaderboard system
- [ ] Daily challenges
- [ ] Customizable themes

## Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` file for more information.

## Acknowledgments

- Inspired by classic reaction time games
- Icons and design influenced by modern mobile gaming UI
- Special thanks to all beta testers

##  Contact

Om Gedam

GitHub: [https://github.com/itsomg134](https://github.com/itsomg134)

Email: [omgedam123098@gmail.com](mailto:omgedam123098@gmail.com)

Twitter (X): [https://twitter.com/omgedam](https://twitter.com/omgedam)

LinkedIn: [https://linkedin.com/in/omgedam](https://linkedin.com/in/omgedam)

Portfolio: [https://ogworks.lovable.app](https://ogworks.lovable.app)
