import pgzrun



alien = Actor('alien')
alien2 = Actor('trump1')
alien.topright = 0, 10
box = Rect((0, 0), (100, 60)) #define box
score = 0
misses = 0
highscore = 0 
WIDTH = 500
HEIGHT = alien.height + 20

def draw():
    global score
    global misses 
    screen.clear()
    screen.draw.filled_rect(box, "red") #draw box
    screen.draw.text("Score "+str(score), (0,0)) #draw score on screen
    screen.draw.text("misses "+str(misses), (0,15)) #draw misses on screen
    screen.draw.text("High Score "+str(highscore), (0,30)) #draw highscore
    if misses > 3:
        screen.clear()
        screen.draw.text("game over, press space to restart", (0,0))
        if keyboard.space == True:
            high_score()
            misses = 0
            score = 0

    elif score > 10: #level 2
        alien2.draw()
    else: #level 1
        alien.draw()

def high_score():
    global highscore
    global score
    if score > highscore:
        highscore = score

def update():
    global score #call score 
    if score > 10: #level 2
        draw()
        alien2.draw()
        alien2.left += 5
        if alien2.left > WIDTH:
            alien2.right  = 0  

    else:        
        alien.left += 2
        if alien.left > WIDTH:
            alien.right = 0

      

def on_mouse_down(pos):
    global misses #call misses
    if alien.collidepoint(pos):
        set_alien_hurt()
    elif alien2.collidepoint(pos):
        set_alien2_hurt()
    else:
        misses = misses + 1
        print("You missed me!")
        screen.draw.text("test",Rect((10,10),(100,100)))

def set_alien_hurt():
    global score #call score
    alien.image = 'alien_hurt'
    sounds.eep.play()
    score = score + 1 #change score
    print("Score:", score) #print score
    clock.schedule_unique(set_alien_normal, 1.0)

def set_alien2_hurt():
    global score #call score
    alien2.image = 'trump2'
    sounds.eep.play()
    score = score + 3 #change score
    print("Score:", score) #print score
    clock.schedule_unique(set_alien_normal, 1.0)

def set_alien_normal():
    alien.image = 'alien'
    alien2.image = 'trump1'




pgzrun.go()